import com.xiaohaha.pojo.Books;
import com.xiaohaha.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl=(BookService) context.getBean("BookServiceImpl");
        for(Books books: bookServiceImpl.queryAllBook()){
            System.out.println(books);
        }
    }
}
