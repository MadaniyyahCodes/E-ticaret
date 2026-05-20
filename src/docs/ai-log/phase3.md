# AI Log — Phase 3: Behavioral Patterns

## Prompt I Asked
"Strategy ve Observer pattern'leri bu projede nerede kullanılabilir? 
Hangisi daha önce uygulanmalı?"

## AI's Answer (Summary)
Yapay Zeka, sepete etkinlik bildirimleri eklemek için önce Gözlemci'yi, ardından indirim seçimini resmileştirmek için Strateji'yi uygulamayı önerdi.
Gözlemci, ürün eklemeleri ve indirim uygulamaları hakkında bildirimde bulunmak için önerildi.
Strateji, Aşama 1'de Fabrika Metodu aracılığıyla kısmen zaten uygulanmıştı ,Aşama 3, dize tabanlı seçim yerine doğrudan strateji nesnelerini kullanarak bunu tamamlıyor.

## What I Implemented and Why
### Pattern 1: Observer
**Nerede:** `CartObserver.java`, `ConsoleObserver.java`, güncellenmiş `ShoppingCart.java`
**Neden:** Alışveriş sepeti olayları gerçekleştiğinde (ürün eklendi, indirim uygulandı) dinleyicileri bilgilendirmek için, ShoppingCart'ın kimin dinlediğini bilmesine gerek kalmadan.

### Pattern 2: Strategy
**Nerede:** `DiscountStrategy.java` ve tüm indirim sınıfları
**Neden:** Strateji 1. Aşamada tanıtıldı ancak burada tamamlandı — indirim nesneleri artık dize anahtarları kullanmak yerine doğrudan aktarılıyor.


## Where AI Was Wrong or Incomplete
AI, Strategy pattern'inin Phase 1'de zaten uygulandığını başta net 
belirtmedi. Phase 3'te tekrar açıklarken fark ettim ki DiscountStrategy 
arayüzü aslında Phase 1'den beri Strategy pattern'ini kullanıyordu.

