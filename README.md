date: 2020-9-2 09:34:45

## 简介

前端采用Vue、Element UI

后端采用Spring Boot、Spring Security、Redis & Jwt

高效率开发，使用代码生成器可以一键生成前后端代码

## 接口文档

[http://ip:port/swagger-ui.html](http://ip:port/swagger-ui.html)

## 模块组成

1、**`ruoyi-admin`** 后台服务模块，后台控制的Controller在这里

2、**`ruoyi-common`** 工具类模块，包含公用的工具类和类库

3、**`ruoyi-framework`** 框架核心模块，包括config系统配置、过滤器

4、**`ruoyi-generator`** 代码生成器模块，对代码生成内容格式的控制

5、**`ruoyi-quartz`** 定时任务模块，作业调度的地方，定时执行任务

6、**`ruoyi-system`** 系统代码模块，包含系统Controller所用到的业务和实体

7、**`one-module`**  自定义模块，包含一组CRUD增删改查

...

## 主要扩展

* `flyway` 数据库版本控制

* `mybatis-plus` 数据库插件

## 快速开始

1、idea 克隆项目

```bash
git clone https://github.com/fumingqin/backEndLib.git
```

<img src="https://gystudies.gitee.io/gystudies/2020/09/10/20200910_%E5%9B%BE%E7%89%87%E5%BA%93/image-20200910090911036.png" alt="image-20200910090939630" style="zoom: 67%;" />.

2、配置项目maven地址 (可省略)

3、创建数据库名 `firstproject`，数据库版本 5.7

4、建议在数据库运行sql文件 `firstproject20200910.sql`，位置在项目 `/sql` 

5、运行后端项目

6、运行前端项目，在项目`/ruoyi-ui`文件夹下

```bash
npm install #安装依赖
npm run dev	#运行
```

## 项目部署(仅供参考)

### 后端部署

```bash
maven clean		#清理
maven install	#打包
```

<img src="https://gystudies.gitee.io/gystudies/2020/09/10/20200910_%E5%9B%BE%E7%89%87%E5%BA%93/image-20200910092259974.png" alt="image-20200910090939630" style="zoom: 67%;" />.

ruoyi-admin 模块使用了打包工具，顾整合包在ruoyi-admin模块下`/target`

<img src="https://gystudies.gitee.io/gystudies/2020/09/10/20200910_%E5%9B%BE%E7%89%87%E5%BA%93/image-20200910093050557.png" alt="image-20200910093050557" style="zoom:67%;" />.

> linux服务器部署 (后期可以用 Docker 简化)

1、安装java环境

2、服务器部署mysql

3、部署项目

```bash
# 例如jar包复制到/home/ruoyi/project文件夹下
nohup java -jar ruoyi-admin.jar > ruoyi.log 2>&1 & 	#支持关闭窗口保持进程的运行
# 将标准输出信息输出到文件ruoyi.log
# 项目中也可以配置日志信息
```

### 前端部署(按需)

部署vue项目 `ruoyi-ui` 

1、服务器安装Nginx

2、修改配置文件

3、打包

```bash
# 打包正式环境
npm run build:prod
```

会在项目根目录生成`dist`文件夹，这个就是打包好的项目

4、放到服务器Nginx指定的文件夹下运行即可

