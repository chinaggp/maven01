package cn.ggp.dao;

import cn.ggp.domain.Items;

/**
 * @author ggp
 * @version V1.0
 * @Package cn.ggp.dao
 * @date 2019/6/15 12:39
 * @Copyright © 2019-2020
 */
public interface ItemsMapper {
    Items findById(int id);
}
