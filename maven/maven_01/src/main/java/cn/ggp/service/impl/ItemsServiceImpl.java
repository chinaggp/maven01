package cn.ggp.service.impl;

import cn.ggp.dao.ItemsMapper;
import cn.ggp.domain.Items;
import cn.ggp.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ggp
 * @version V1.0
 * @Package cn.ggp.service.impl
 * @date 2019/6/15 18:21
 * @Copyright © 2019-2020
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;
    public Items findById(int i) {
        return itemsMapper.findById(i);
    }
}
