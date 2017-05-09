package com.gfax.api.test.controller;

import com.gfax.api.test.model.IProfile;
import com.gfax.api.test.service.IProfileService;
import com.gfax.api.base.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lxh on 2017/5/8.
 */
@Controller
@RequestMapping(value = "test")
public class TestController extends BaseController {

    @Autowired
    IProfileService iProfileService;

    @RequestMapping(value = "profile/getbykey", method = { RequestMethod.GET })
    @ResponseBody
    public Object getByKey(String umid, String username) {
        IProfile entry = iProfileService.queryByKey(umid, username);
        Map<String, Object> data = new HashMap<String, Object>();
        if(entry == null) {
            this.setResult(null, "用户不存在", FAILURE);
        } else {
            data.put("entry", entry);
            this.setResult(data, "成功", SUCCESS);
        }

        return this.getResult();
    }

}
