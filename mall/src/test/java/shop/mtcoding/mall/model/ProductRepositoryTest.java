package shop.mtcoding.mall.model;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

@Import(ProductRepository.class)
@DataJpaTest // T -> DS -> C -> ( R -> DB )
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

@Test
    public  void findByIdDTO_test(){
        productRepository.save("바나나", 5000, 50);

        ProductDTO  productDTO = productRepository.findByIdTO(1);
        System.out.println("=============");
        System.out.println(productDTO.getId());
        System.out.println(productDTO.getName());
        System.out.println(productDTO.getPrice());
        System.out.println(productDTO.getQty());
        System.out.println(productDTO.getDes());

    }
    @Test
    public void findByIdJoinSeller_test(){
        //given (테스트를 하기위해서 필요한 데이터만들기)
        productRepository.save("바나나", 5000, 50);

        //when (테스트진행)
        Product product = productRepository.findByid(1);

        //then (테스트확인)
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQty());
    }
    @Test
    public void findById_test(){
        //given (테스트를 하기위해서 필요한 데이터만들기)
        productRepository.save("바나나", 5000, 50);

        //when (테스트진행)
        Product product = productRepository.findByid(1);

        //then (테스트확인)
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQty());
    }

    @Test
    public void findAll_test(){
        productRepository.save("바나나", 5000, 50);
        productRepository.save("바나나", 5000, 50);

        //when
        List<Product> productList =  productRepository.findAll();


        //then
        for (Product product : productList) {
            System.out.println("=============");
            System.out.println(product.getId());
            System.out.println(product.getName());
            System.out.println(product.getPrice());
            System.out.println(product.getQty());



        }

    }
}