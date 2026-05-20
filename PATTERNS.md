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