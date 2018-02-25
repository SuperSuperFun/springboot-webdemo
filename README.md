# springboot-webdemo

### 注意事项：
1.springboot创建的web项目，resources下默认有static和template这两个文件夹；<br>
2.static文件中一般存放css，js，image等静态资源文件，而templates文件中一般存放各种HTML文件，controller默认访问该文件夹下的html文件，
而且这两个文件都是默认存在的，路径不需要特别的配置就可以直接引用了；<br>
3.Application启动类跟controller包等平行；<br>
4.springboot默认缓存templates下的文件，如果html页面修改后，看不到修改的效果，设置spring.thymeleaf.cache = false即可。<br>

**具体参考博客：http://blog.csdn.net/isea533/article/details/50412212**
