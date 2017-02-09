/**
  * Created by ML53MI on 9-2-2017.
  */
package cong.com.nificonnect



def

val streamExecEnv = StreamExecutionEnvironment.getExecutionEnvironment()

val clientConfig: SiteToSiteClientConfig = new SiteToSiteClient.Builder()
  .url("http://localhost:8080/nifi")
  .portName("Data for Flink")
  .requestBatchCount(5)
  .buildConfig()

val nifiSource = new NiFiSource(clientConfig)







val streamExecEnv = StreamExecutionEnvironment.getExecutionEnvironment()

val clientConfig: SiteToSiteClientConfig = new SiteToSiteClient.Builder()
  .url("http://localhost:8080/nifi")
  .portName("Data from Flink")
  .requestBatchCount(5)
  .buildConfig()

val nifiSink: NiFiSink[NiFiDataPacket] = new NiFiSink[NiFiDataPacket](clientConfig, new NiFiDataPacketBuilder<T>() {...})

streamExecEnv.addSink(nifiSink)


