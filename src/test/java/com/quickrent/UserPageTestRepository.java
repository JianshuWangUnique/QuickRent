package quickRent.variableRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import quickRent.variable.User;

import javax.transaction.Transactional;
import java.awt.print.Pageable;

//分页查询/测试
@Transactional
public interface UserPageTestRepository extends PagingAndSortingRepository<User,String> {
    //@Query("select t from TestPage t,TestPageRef r where t.id = r.testId and r.enabled = :enabled")
    //public Page<User> findList(@Param("enabled") boolean enabled, Pageable pageable);
}
