# first-benchmark
benchmark String manipulation


## Basic Usage
    mvn clean install
    java -jar target/benchmarks.jar -bm avgt -tu ns -wi 5 -i 5 -f 5


## Results
```bash
# JMH version: 1.20
# VM version: JDK 1.8.0_152, VM 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.sandbox.MyBenchmark.testStringBuilder

Benchmark                               Mode  Cnt     Score    Error  Units
---------------------------------------------------------------------------
Benchmark                               Mode  Cnt     Score    Error  Units
MyBenchmark.testStringBuilder           avgt   25   125.761 ±  1.012  ns/op
MyBenchmark.testStringFormatter         avgt   25  1019.133 ± 10.539  ns/op
MyBenchmark.testStringJoinerAndStreams  avgt   25   449.380 ±  5.451  ns/op
```