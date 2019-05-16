package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.GoodsTypeDaoImpl;
import tnSpringHibernate.models.GoodsType;

import javax.transaction.Transactional;

/**
 * Implementation methods of dao for good types
 */
@Service
public class GoodsTypeService {

    private GoodsTypeDaoImpl goodsTypeDao = new GoodsTypeDaoImpl();

    public GoodsTypeService() {

    }

    public GoodsType findById(int idGoodType) {
        return goodsTypeDao.findById(idGoodType);
    }

    public GoodsType findByGoodType(String goodType) {
        return goodsTypeDao.findByGoodType(goodType);
    }

    @Transactional
    public void saveGoodsType(GoodsType goodsType) {
        goodsTypeDao.save(goodsType);
    }

    @Transactional
    public void updateGoodsType(GoodsType goodsType) {
        goodsTypeDao.update(goodsType);
    }

    @Transactional
    public void deleteGoodsType(GoodsType goodsType) {
        goodsTypeDao.delete(goodsType);
    }
}
