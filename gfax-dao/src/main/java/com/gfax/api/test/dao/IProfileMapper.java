package com.gfax.api.test.dao;

import com.gfax.api.test.model.IProfile;
import com.gfax.api.test.model.IProfileKey;
import org.springframework.stereotype.Repository;

/**
 * Eclipse 不需要加任何东西，但是 IDEA 不加会报错.
 */
@Repository
public interface IProfileMapper {
    int deleteByPrimaryKey(IProfileKey key);

    int insert(IProfile record);

    int insertSelective(IProfile record);

    IProfile selectByPrimaryKey(IProfileKey key);

    int updateByPrimaryKeySelective(IProfile record);

    int updateByPrimaryKey(IProfile record);
}