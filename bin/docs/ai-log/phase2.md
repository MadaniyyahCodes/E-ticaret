# AI Log — Phase 2: Structural Patterns

## Prompt I Asked
"Adapter pattern burada uygun mu, yoksa Facade mı? Decorator ile 
Facade arasındaki farkı açıkla."

## AI's Answer (Summary)
Yapay Zeka, uyumsuz bir arayüz olmadığı için (kod tabanı zaten tutarlı) Facade'i Adapter'a tercih etti.
Facade, sepet, fabrika ve indirim mantığının karmaşıklığını tek bir basit CheckoutFacade sınıfının arkasına gizlemek için daha uygundu.

İndirimleri birleştirmek için Yapay Zeka, Decorator'ı Bridge'e tercih etti çünkü
Decorator, mevcut sınıfları değiştirmeden çalışma zamanında davranışı sarmalar, bu da doğrudan PROBLEMS.md'deki "indirimler birleştirilemez" sorununu çözer.

## What I Implemented and Why
### Desen 1: Dekoratör
**Nerede:** `DiscountDecorator.java`, `WelcomeDecorator.java`, `BlackFridayDecorator.java`
**Neden:** 0. Aşamada belirlenen sorunu çözmek için — indirimler birleştirilemiyordu.
Dekoratör, mevcut herhangi bir sınıfı değiştirmeden çalışma zamanında indirimleri birbirinin etrafına sarmaya olanak tanır.

### Desen 2: Cephe
**Nerede:** `CheckoutFacade.java`
**Neden:** Sepet yönetimi, ürün oluşturma ve indirim uygulamasının karmaşıklığını tek bir basit arayüzün arkasına gizlemek için.

## Where AI Was Wrong or Incomplete

Yapay zeka, Adapter'ı olası bir alternatif olarak önerdi ancak bu bağlamda neden Facade'den daha az uygun olduğunu açıkça açıklamadı. Bunu kendim çözmek zorunda kaldım, Adapter uyumsuz arayüzleri düzeltiyor, ancak arayüzlerimiz zaten uyumluydu, bu da Facade'i daha uygun hale getiriyordu.

