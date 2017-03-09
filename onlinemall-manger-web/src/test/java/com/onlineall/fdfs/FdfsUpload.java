package com.onlineall.fdfs;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

public class FdfsUpload {
	@Test
	public void upload() throws Exception {
		// 向项目中添加jar包
		// 创建一个配置文件配置tracker服务器地址
		//加载配置文件
		ClientGlobal.init("F:/JavaCode/2017/onlinemall-parent/onlinemall-manger-web/src/main/resources/fdfs/fdfs.conf");
		//创建一盒tracker客户端对象
		TrackerClient trackerClient = new TrackerClient();
		//使用trackerclient获取trackersever对象
		TrackerServer trackerServer = trackerClient.getConnection();
		//创建一个stragedserver对象 
		StorageServer storageServer = null;
		//创建一个storageclient 对象
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		//利用storageclient对象上传图片
		String[] upload_file = storageClient.upload_file("C:/Users/msi/Pictures/20170218090505.png", "png", null);
		for(String s : upload_file){
			System.out.println(s);
		}
	}
}
