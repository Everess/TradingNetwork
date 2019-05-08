package tnSpringHibernate.services;

import tnSpringHibernate.dao.GoodsListDaoImpl;
import tnSpringHibernate.models.GoodsList;

/**
 * Implementation methods of dao for good list
 */
public class GoodsListService {

    private GoodsListDaoImpl goodsListDao = new GoodsListDaoImpl();

    public GoodsListService() {

    }

    public GoodsList findById(int idGood) {
        return goodsListDao.findById(idGood);
    }

    public GoodsList findByIdGoodType(int idGoodType) {
        return goodsListDao.findByIdGoodType(idGoodType);
    }

    public GoodsList findByNameOfGood(String nameOfGood) {
        return goodsListDao.findByNameOfGood(nameOfGood);
    }

    public void save(GoodsList goodsList) {
        goodsListDao.save(goodsList);
    }

    public void update(GoodsList goodsList) {
        goodsListDao.update(goodsList);
    }

    public void delete(GoodsList goodsList) {
        goodsListDao.delete(goodsList);
    }
}
