# task5

“Smart Transport Management System”
Təsvir:
Bir şəhərdə müxtəlif nəqliyyat vasitələri (məsələn: avtobus, taksi, velosiped, scooter və s.) ilə
hərəkəti idarə edən bir Transport Management System qurmaq lazımdır. Bu sistem:
 Müxtəlif nəqliyyat növlərini təmsil etməlidir.
 Hər bir nəqliyyat növünün öz xüsusiyyətləri və davranışı olmalıdır.
 Nəqliyyat növləri müxtəlif tariflərə, sürət limitlərinə, və tipik istifadə sahələrinə
malik olmalıdır.
 İstifadəçi hansısa bir nəqliyyat növünü seçib onunla səyahət etmək istəyəndə sistem
təxmini məsafəyə əsasən qiymət və vaxt hesablaya bilməlidir.
 Tariflər Enum vasitəsilə təyin olunacaq.
 Bütün nəqliyyat vasitələri ortaq bir interface və ya abstract class-dan törəməlidir.
 Polimorfizm vasitəsilə müxtəlif nəqliyyat növləri eyni metodlara fərqli şəkildə reaksiya
verməlidirlər.
 Method Overloading və Overriding istifadə olunmalıdır.
 Encapsulation ilə obyektin daxili məlumatları qorunmalıdır.
Texniki Tələblər:
1. enum TransportType { BUS, TAXI, BICYCLE, SCOOTER }
2. interface Transport
3. class Bus, class Taxi, class Bicycle, class Scooter – hamısı Transport-dan
implements etməlidir. Calsslar daxilinde private final double ratePerKm ve
4. private final double speed olmalidir ve deyerleri ferqli olmalidir
5. Hər sinif calculateFare(double distance) və calculateTime(double distance)
ve String getTransportInfo() metodlarını override etməlidir.Methoda daxilinde
ratePerKm ve speed istifade olunmalidir
6. Əlavə olaraq calculateFare(double distance, int passengers) kimi overload
edilmiş method da olsun.
7. Butun methodlar birbasa Transport daxilinde olmalidir ,lakin her bir
methodun daxilindeki mentiqi her bir child class daxilinde ferqli
olmalidir
8. TransportManager sinfi – istifadəçidən transport növünü, məsafəni və sərnişin sayını
qəbul edir, nəticəni çap edir.
9. TransportManager sinifi daxilinde ise static Transport
getTransport(TransportType type) methodu olmalidir switch vasitesile
her bir enuma qarsiliq gelen class qaytarmalidir

public static void main(String[] args) {

// Məsələn: istifadəçi TAXI seçir
TransportType userChoice = TransportType.TAXI;
double distance = 10.0;
int passengers = 2;

Transport transport = getTransport(userChoice);
System.out.println(&quot;Transport Info: &quot; + transport.getTransportInfo());
System.out.println(&quot;Fare for &quot; + passengers + &quot; passenger(s): &quot; +
transport.calculateFare(distance, passengers));
System.out.println(&quot;Estimated time: &quot; +
transport.calculateTime(distance) + &quot; hours&quot;);
}
