package com.gfax.api.test.service;

import com.gfax.api.test.model.IProfile;
import com.gfax.api.test.model.IProfileKey;

/**
 * Created by lxh on 2017/5/8.
 */
public interface IProfileService {

    IProfile queryByKey(String umid, String username);
}
