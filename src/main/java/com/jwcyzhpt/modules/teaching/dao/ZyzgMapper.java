
package com.jwcyzhpt.modules.teaching.dao;
        import java.util.List;
        import com.jwcyzhpt.modules.teaching.entity.dto.Jyjl;
        import com.jwcyzhpt.modules.teaching.entity.dto.Zyzg;


public interface ZyzgMapper {
    List<Zyzg> findAllZyzg(Zyzg zyzg);

    List<Zyzg>  findAllZyzg2(String guid);
/*新增专业技术资格*/
   Integer addZyzg(Zyzg zyzg);

  /*删除专业技术资格信息*/
   Integer delZyzg(Zyzg zyzg);


   /*修改*/
   Integer updateZyzg(Zyzg zyzg);


}
