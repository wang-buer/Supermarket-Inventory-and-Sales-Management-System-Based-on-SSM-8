package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpintuihuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpintuihuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpintuihuoView;


/**
 * 商品退货
 *
 * @author 
 * @email 
 * @date 2022-04-25 18:09:26
 */
public interface ShangpintuihuoService extends IService<ShangpintuihuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpintuihuoVO> selectListVO(Wrapper<ShangpintuihuoEntity> wrapper);
   	
   	ShangpintuihuoVO selectVO(@Param("ew") Wrapper<ShangpintuihuoEntity> wrapper);
   	
   	List<ShangpintuihuoView> selectListView(Wrapper<ShangpintuihuoEntity> wrapper);
   	
   	ShangpintuihuoView selectView(@Param("ew") Wrapper<ShangpintuihuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpintuihuoEntity> wrapper);
   	

}

