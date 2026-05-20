# PATTERNS.md

## Phase 1 — Factory Method

WHERE
`DiscountFactory.java` bir dize girdisine göre doğru `DiscountStrategy` nesnesini oluşturur ve döndürür.

WHY
`ShoppingCart`, indirim mantığını doğrudan if-else bloklarıyla ele alıyordu.

Her yeni indirim, `ShoppingCart`'ı değiştirmeyi gerektiriyordu ve bu da Açık/Kapalı Prensibi'ni ihlal ediyordu.

ACHIEVEMENT
- `ShoppingCart` artık herhangi bir indirim sınıfı hakkında bilgi sahibi değil
- Yeni bir indirim eklemek = fabrikada yeni bir sınıf + bir satır oluşturmak
- Her indirim ayrı ayrı test edilebilir

## Phase 2 — Decorator

WHERE
`DiscountDecorator.java`, `WelcomeDecorator.java`, `BlackFridayDecorator.java`

WHY
Orijinal tasarımda indirimler birleştirilemiyordu. Dekoratör, mevcut herhangi bir sınıfı değiştirmeden, çalışma zamanında indirim nesnelerini birbirinin etrafına sarmaya olanak tanır.

ACHIEVEMENT
- Birden fazla indirim artık herhangi bir sırada birleştirilebilir
- Yeni bir indirim dekoratörü eklemek mevcut koda dokunmaz
- PROBLEMS.md dosyasındaki 5. sorunu çözer

---

## Phase 2 — Facade

WHERE
`CheckoutFacade.java`

WHY
İstemci (main.java) doğrudan sepeti, ürünleri, fabrikayı ve indirimleri yönetiyordu. Cephe, tüm bunları tek bir basit arayüzün arkasına gizler.

ACHIEVEMENT
- İstemci kodu daha basit ve okunması daha kolay
- İç karmaşıklık CheckoutFacade'in arkasına gizlendi
- Sepet veya indirim mantığındaki değişiklikler istemciyi etkilemiyor