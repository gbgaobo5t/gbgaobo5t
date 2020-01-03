package com.jiagouedu.znode;/* ━━━━━━如来保佑━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG━━━━━━
 * 图灵学院-悟空老师
 * 以往视频加小乔老师QQ：895900009
 * 悟空老师QQ：245553999
 */

import com.jiagouedu.zookeeper.znode.ZookeeperCrud;
import org.apache.zookeeper.KeeperException;

public class Test {
   public static void main(String[] args) throws KeeperException, InterruptedException {
      ZookeeperCrud zookeeperCrud=new ZookeeperCrud();
      zookeeperCrud.createPersistent("/qingquan","abc");  //建立qingquan的节点,数值是abc
     //   zookeeperCrud.createEphemeral("/qingquan1","abc");  //建立临时节点
    /*  if(null!=zookeeperCrud.exists("/wukong"))
      zookeeperCrud.delete("/wukong");
      zookeeperCrud.createEphemeral("/wukong","abc");
      System.out.println(zookeeperCrud.getData("/wukong"));;*/

   }
}
