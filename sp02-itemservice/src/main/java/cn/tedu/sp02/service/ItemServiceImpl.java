package cn.tedu.sp02.service;

import cn.tedu.entity.Item;
import cn.tedu.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public List<Item> getItems(String orderId) {
        log.info("获取订单商品列表，orderId="+orderId);
        List<Item> list = new ArrayList<>();
        list.add(new Item(1,"商品1",1));
        list.add(new Item(2,"商品2",5));
        list.add(new Item(3,"商品3",2));
        list.add(new Item(4,"商品4",4));
        list.add(new Item(5,"商品5",1));
        return list;
    }

    @Override
    public void decreaseNumbers(List<Item> list) {
        for(Item item : list){
            log.info("减少库存:"+item);
        }
    }
}
