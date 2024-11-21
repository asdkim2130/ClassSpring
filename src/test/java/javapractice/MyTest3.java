package javapractice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MyTest3 {



    @Test
    void function() {

        assertThat(function(50)).isEqualTo(50);
        assertThat(function(150)).isEqualTo(100);
        assertThat(function(-30)).isEqualTo(0);

    }

    int function (int a){
        Math.min(a, 100);
        return Math.max(Math.min((a), 100), 0);
    }






    }





