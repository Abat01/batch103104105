package practice09;

import day31maps.HashMap;

import java.util.Map;

public class Map_UrunFiyatlariniTopla {
}

        public static void main(String[] args) {

            HashMap<String, Double> urunFiyati = new HashMap<>();
            urunFiyati.  ("Kemer", 19.99);
            urunFiyati.put("Gömlek", 29.99);
            urunFiyati.put("Ayakkabı", 89.99);
            urunFiyati.put("Kazak", 24.99);
            urunFiyati.put("Kravat", 19.99);

            System.out.println(fiyatToplami(urunFiyati));

        }

        public static double fiyatToplami(Map<String, Double> map) {
            System.out.println("Ürünler ve fiyatları: " + map);

            double toplam = 0;
            for (double w : map.values()) {
                toplam += w;

            }

            return toplam;
        }
    }
}
