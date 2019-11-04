package com.wl.demo.util;

import com.wl.demo.vo.ResultVo;

/**
 * @author w.z
 * @date 2019/8/8 16:59
 * controller返回结果方法
 */
public class ResultUtil {
    
    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("请求成功");
        resultVo.setData(object);
        return resultVo;
    }
    
    public static ResultVo success(){
        return success(null);
    }
    
    public static ResultVo error(String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
