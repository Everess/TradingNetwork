package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.GoodsListDaoImpl;
import tnSpringHibernate.models.GoodsList;

import javax.transaction.Transactional;

/**
 * Implementation methods of dao for good list
 */
@Service
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

    @Transactional
    public void saveGoodsList(GoodsList goodsList) {
        goodsListDao.save(goodsList);
    }

    @Transactional
    public void updateGoodsList(GoodsList goodsList) {
        goodsListDao.update(goodsList);
    }

    @Transactional
    public void deleteGoodsList(GoodsList goodsList) {
        goodsListDao.delete(goodsList);
    }
}
