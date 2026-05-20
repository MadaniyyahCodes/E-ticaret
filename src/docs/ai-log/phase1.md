# AI Log — Phase 1: Creational Patterns

Prompt I Asked
"Bu kodda hangi tasarım hatası görüyorsun? Hangi tasarım örüntüleri
bu sorunları çözebilir mi? Her sorun için kısa bir açıklama yazın."

AI's Answer (Summary)
Yapay Zeka, kendi analizimle eşleşen 5 yapısal sorun belirledi:
OCP ihlali, SRP ihlali, string tipinde indirimler, indirim soyutlaması yok ve indirimler birleştirilemiyor. Ayrıca kaçırdığım bir bonus sorunu da yakaladı: BUY_2_GET_1 kuralı, en ucuz ürünü ücretsiz vermek yerine sabit 10$ indirim uyguluyor.

Aşama 1 için Yapay Zeka, indirim nesnesi oluşturmayı ShoppingCart'tan özel bir DiscountFactory sınıfına taşımak için Fabrika Yöntemi'ni uygulamayı önerdi.

What I Implemented and Why

 Pattern: Factory Method
Where: `DiscountFactory.java`
Why I chose it: ShoppingCart, indirim davranışını doğrudan if-else yapısıyla satır içi olarak oluşturuyordu.
Factory Metodu, nesne oluşturmayı merkezileştiriyor, böylece ShoppingCart artık hangi indirim sınıfını kullanacağını bilmek zorunda kalmıyor.

How it works:
- `DiscountStrategy` arayüzü `apply(double total)`'ı tanımlar.
- Her indirim kendi sınıfıdır (WelcomeDiscount, BlackFridayDiscount, vb.).
- `DiscountFactory.getDiscount(String type)` doğru nesneyi döndürür.
- ShoppingCart, dizeleri kendisi kontrol etmek yerine fabrikayı çağırır.

Did I Copy the AI Output?

Hayır. Yapay zeka deseni önerdi ve kavramı açıkladı. Yapıyı anladıktan sonra her sınıfı kendim yazdım.

Yapay Zeka Önerisinden Farklılık
Önerilen yapıyı takip ettim