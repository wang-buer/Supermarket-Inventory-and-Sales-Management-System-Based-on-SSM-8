package com.dao;

import com.entity.ShangpintuihuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpintuihuoVO;
import com.entity.view.ShangpintuihuoView;


/**
 * 商品退货
 * 
 * @author 
 * @email 
 * @date 2022-04-25 18:09:26
 */
public interface ShangpintuihuoDao extends BaseMapper<ShangpintuihuoEntity> {
	
	List<ShangpintuihuoVO> selectListVO(@Param("ew") Wrapper<ShangpintuihuoEntity> wrapper);
	
	ShangpintuihuoVO selectVO(@Param("ew") Wrapper<ShangpintuihuoEntity> wrapper);
	
	List<ShangpintuihuoView> selectListView(@Param("ew") Wrapper<ShangpintuihuoEntity> wrapper);

	List<ShangpintuihuoView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpintuihuoEntity> wrapper);
	
	ShangpintuihuoView selectView(@Param("ew") Wrapper<ShangpintuihuoEntity> wrapper);
	

}
