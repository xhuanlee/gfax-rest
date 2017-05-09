package com.gfax.api.test.service.impl;

import com.gfax.api.test.dao.IProfileMapper;
import com.gfax.api.test.model.IProfile;
import com.gfax.api.test.model.IProfileKey;
import com.gfax.api.test.service.IProfileService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lxh on 2017/5/8.
 */
@Service("iProfileService")
public class IProfileServiceImpl implements IProfileService {

    @Autowired
    IProfileMapper mapper;

    public IProfile queryByKey(String umid, String username) {
        if(StringUtils.isBlank(umid) || StringUtils.isBlank(username)) {
            return null;
        }
        IProfileKey key = new IProfileKey();
        key.setUmid(umid);
        key.setUsername(username);

        return mapper.selectByPrimaryKey(key);
    }
}
