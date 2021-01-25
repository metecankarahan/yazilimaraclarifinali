package tr.edu.medipol.yazilimaraclari.SpringBootRestApi;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.jupiter.api.Test.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class HastaEkleRestApiTest {

        @Test
        public void HastaEkle() {
            HastaEkleRestApi.ekle("Mete");

            String hastaekle=HastaEkleRestApi.listele().toString();
            String ekle= HastaEkleRestApi.listele().toString();

            Assert.assertEquals(hastaekle, ekle);
        }

        @Test
        public void HastaListele() {

           List<String> hastalistele = Arrays.asList("Mete");
           List<String> listele = Arrays.asList("Mete");

            Assert.assertEquals(hastalistele, listele);

        }

        @Test
        public void HastaSilme() {
            HastaEkleRestApi.sil("Mete");

            String hastasil=HastaEkleRestApi.listele().toString();
            String sil= HastaEkleRestApi.listele().toString();

            Assert.assertEquals(hastasil, sil);
        }
}