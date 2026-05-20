# PROBLEMS.md

My Analysis

Sorun 1 — Tek Sorumluluk İlkesi İhlali
`calculateTotal()` metodu, her yeni indirim eklendiğinde değiştirilmelidir.
Çalışan bir metoda kod eklemek, mevcut indirimlerin bozulması riskini taşır.

Sorun 2 — Tek Sorumluluk İlkesi İhlali
`ShoppingCart` iki iş yapar: ürünleri yönetmek VE indirimleri hesaplamak.
Bunlar ayrı sınıflar olmalıdır.

Sorun 3 — Dize Tabanlı Tip Kontrolü
İndirim türü ham bir Dize olarak iletilir ("WELCOME10", "BLACKFRIDAY").
Bir yazım hatası sessiz bir hataya neden olur  indirim uygulanmaz, hata mesajı verilmez.

 Sorun 4 — İndirim Soyutlaması Yok
Her indirim sadece bir if-else bloğudur, bir nesne değildir.
İndirimleri bağımsız olarak yeniden kullanamaz, test edemez veya değiştiremezsiniz.

Sorun 5 — İndirimleri Birleştirmek İmkansız
Tasarım, aynı anda yalnızca bir indirim uygulayabilir.
Metodu yeniden yazmadan indirimleri bir araya getirmenin bir yolu yoktur.


## AI Comparison
   Yapay Zekanın Buldukları:
- OCP ihlali (1. Problemimle aynı)
- SRP ihlali (2. Problemimle aynı)
- Dize türü güvenlik sorunu (3. Problemimle aynı)
- İndirim soyutlaması yok (4. Problemimle aynı)
- İndirimler birleştirilemiyor (5. Problemimle aynı)
- Gözden kaçırdığım bir tane daha buldu: BUY_2_GET_1 mantığı aslında yanlış

  Benim Bulduklarım ve Yapay Zekanın Buldukları:
5 problemimin tamamı doğrulandı.

  Farklılıklar:
Yapay Zeka, fark etmediğim 6. bir problem buldu — BUY_2_GET_1 kuralı
düz bir 10$ indirim yapıyor ki bu kuralı doğru şekilde uygulamıyor.

Bu, Yapay Zekanın sadece yapısal sorunları değil, mantık hatalarını da tespit etmede yararlı olduğunu gösteriyor.

 Önerilen Kalıplar:
- Strateji Kalıbı → indirim mantığı için (1. Aşama planı)
- Dekoratör Kalıbı → indirimleri birleştirmek için (2. Aşama planı)