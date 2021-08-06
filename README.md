Thread, her bir işlemin altında çalışan alt işlemlere denir.  Runnable arayüzünün kullanımı için arayüz metotları sınıf tarafından  uygulanır yani implements, başka sınıftan kalıtım alabiliriz. Threadler iş parçacıkları olduklarından çoklu görevlerde senkronizasyon sağlarlar. Avantajı aynı anda birdan fazla işlemi gerçekleştirebilirsiniz. Dezavantajı ise thread sayısı ile her bir threadın çalıştırılma miktarı arasında ters bir ortantı söz konusu olmasıdır. Runnable arayüzü Thread sınıfının sahip olduğu bazı metodlara sahip değildir. Dolayısıyla Runnable arayüzünü implemente edersek bu ilgili metodları kullanamayız.

Kaynak:
1.	https://www.gencayyildiz.com/blog/multi-thread-calismanin-avantaj-ve-dezavantajlari/
2.	https://developpaper.com/analysis-of-spring-boot-timing-multithreading-execution-process/
3.	https://www.youtube.com/watch?v=F49Ir793Ppw
4.	https://www.youtube.com/watch?v=UBYKOazm8Dg
