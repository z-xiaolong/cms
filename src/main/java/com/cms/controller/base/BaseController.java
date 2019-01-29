package com.cms.controller.base;

import com.cms.entity.Page;
import com.cms.util.FHLogger;
import com.cms.util.PageData;
import com.cms.util.UuidUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    protected FHLogger logger = FHLogger.getLogger(this.getClass());

    private static final long serialVersionUID = 6357869213649815390L;

    /** new PageData对象
     * @return
     */
    public PageData getPageData(){
        return new PageData(this.getRequest());
    }

    /**得到ModelAndView
     * @return
     */
    public ModelAndView getModelAndView(){
        return new ModelAndView();
    }

    /**得到request对象
     * @return
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    /**得到32位的uuid
     * @return
     */
    public String get32UUID(){
        return UuidUtil.get32UUID();
    }

    /**得到分页列表的信息
     * @return
     */
    public Page getPage(){
        return new Page();
    }

    public static void logBefore(FHLogger logger, String interfaceName){
        logger.info("");
        logger.info("start");
        logger.info(interfaceName);
    }

    public static void logAfter(FHLogger logger){
        logger.info("end");
        logger.info("");
    }
}
