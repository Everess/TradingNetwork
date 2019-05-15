package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.GoodsTypeDaoImpl;
import tnSpringHibernate.models.GoodsType;

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

    public void save(GoodsType goodsType) {
        goodsTypeDao.save(goodsType);
    }

    public void update(GoodsType goodsType) {
        goodsTypeDao.update(goodsType);
    }

    public void delete(GoodsType goodsType) {
        goodsTypeDao.delete(goodsType);
    }
}
