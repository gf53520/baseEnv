# https://github.com/big-data-europe/docker-hadoop/issues/98
Configuration conf = new Configuration();
conf.setBoolean("dfs.client.use.datanode.hostname", true);
conf.setBoolean("dfs.datanode.use.datanode.hostname", true);
conf.set("fs.defaultFS", "hdfs://namenode:8020");
