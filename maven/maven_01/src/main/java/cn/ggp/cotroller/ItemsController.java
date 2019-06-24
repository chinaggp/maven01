package cn.ggp.cotroller;

import cn.ggp.domain.Items;
import cn.ggp.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ggp
 * @version V1.0
 * @Package cn.ggp.cotroller
 * @date 2019/6/15 16:05
 * @Copyright © 2019-2020
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/show")
    public ModelAndView showItems(int id,ModelAndView modelAndView){
    Items item=itemsService.findById(1);
    modelAndView.addObject("item",item);
    modelAndView.setViewName("item");
    return modelAndView;
    }
}
