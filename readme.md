## 这是什么

这是一份为论坛带来md风格的stylish样式

## 说明

目前只做了常用的板块，后面会慢慢加上的。

之所以没做完就放出来，主要还是想得到一些反馈。

鄙人前端水平实在拿不出手，有太多问题没办法提前预料到。~~（找到管理员大佬彩蛋的我瑟瑟发抖）~~

如果大家在使用过程中有遇到问题，请积极反馈。最好提供截图、屏幕尺寸、电脑分辨率。

## 有什么用

放几张预览图

![首页.png](https://i.loli.net/2020/04/20/NCTwb3KAmLRkJj5.png)

![导读.png](https://i.loli.net/2020/03/16/jJRZaibKuDQSnxN.png)

![帖子.png](https://i.loli.net/2020/03/16/iPRnzLFQZxCKpsa.png)

![板块.png](https://i.loli.net/2020/03/16/XgFEzblUcoPwyOx.png)

## 更新

**2020-05-16**
1. update: 重新适配页脚部分的，替换原本你的图片为新logo
2. update: 在导航栏加入一个logo，可以快速回到首页
3. add: 增加对消息和提醒区域的适配

**2020-05-14**
1. fix: 解决首页文字过小的bug？？？

**2020-05-08**
1. fix: 由于论坛页面调整导致的帖子页面标题不居中
2. fix: 由于论坛页面调整导致的帖子页面内容宽度问题

**2020-04-19**
1. fix: 首页 某些分区移动了位置，做个适配
2. fix: 首页 Steam平台周边错位
3. fix: 首页tab页中的帖子列表可滚动后，显示不完全
4. update: 首页tab页中的帖子的标题的信息的鼠标悬停效果

**2020-03-29**
1. 修复首页tab页标题过长让标题超出tab范围
2. 改善tab中的标题的鼠标悬停的效果
3. 加大帖子回复区域的高度

**2019-10-16**
1. 修复论坛更换logo带来的若干小毛病
2. 调整导读页的导航栏的“>”
3. 修复上次更新导致的颜色自定义失效

**2019-10-24**
1. 适配论坛新域名 keylol.com

**2019-10-01**
1. 更新帖子部分"引用"的样式

**2019-06-03**
1. update: 重新截图

**2019-05-30**
1. add: 适配导读界面（最新热门、最新精华、最新回复、最新发表、抢沙发、我的帖子）
2. fix: 板块页面，网址正则匹配错误
3. update: 首页做了点调整

**2019-05-28**
1. update: 重新做首页的样式，主要是距离以及颜色的调整
2. update: 不在推荐安装stylish，改为stylus
3. add: 增加主题色自定义设置,已经安装的可以重新安装

**2019-05-27**
1. update: 重做帖子标题部分适配
2. update: 修改帖子板块域名正则匹配
3. add: 增加3张预览图
4. add: 帖子内容分类小标题变成多行

**2019-05-26**
1. add: 首页、板块帖子列表、帖子详情

## 安装

### 1. 安装Stylus插件

- [chrome](https://chrome.google.com/webstore/detail/stylus/clngdbkpkpeebahjckkjfobafhncgmne?utm_source=chrome-ntp-icon)
- [firefox](https://addons.mozilla.org/en-US/firefox/addon/styl-us/)
- [opera](https://addons.opera.com/en-gb/extensions/details/stylus/)

### 2. 安装我的[MDSteamCN](https://userstyles.org/styles/172244/mdsteamcn)样式

进入页面点**Install Style**就可以了,在安装之前可以选择 **Customize Settings**自定义主题色。

## 接锅

每个人的审美有不一样，所以我把项目托管于[github](https://github.com/marioplus/MDSteamCN)

本人主力开发语言为java, 所以基于java写了一套简化流程的帮助类。

### 项目结构

```
MDSteamCN
│
├─src
│  └─main
│      ├─java
│      │  └─com
│      │      └─marioplus
│      │          └─mdsteam
│      │              │  Main.java                  调用下面这货
│      │              │  Md.java                    一些经常使用的样式的工具类
│      │              │
│      │              ├─enums
│      │              │      ...
│      │              │
│      │              ├─export
│      │              │      Export.java            打包
│      │              │      ExportConfig.java
│      │              │
│      │              └─utils
│      │                      YamlFc.java
│      │
│      └─resources
│          ├─config
│          │      export.yml                        打包配置
│          │
│          ├─css                                    不同模块的样式文件
│          │      guide-digest-sofa.css
│          │      ...
│          │
│          ├─out
│          │      main.css                          打包后的文件
│          │
│          └─release                                存放每个版本的导出文件
│              ├─20200104
│              │      ...
```

### 配置文件

配置位于 **src/main/resources/config/export.yml**

截取其中一部分

```yaml
path:
  # 资源文件夹，存放每个模块的样式文件
  source: ./src/main/resources/css/
  # 输出文件，打包后的输出
  out: ./src/main/resources/out/main.css
# 匹配模式，对应stylus的4种模式，仅仅为了复制方便，没有其他用途
match-mode:
  # 域名
  domain: domain
  # 固定url
  url: url
  # url前缀
  url-prefix: url-prefix
  # 正则
  regexp: regexp
# 资源文件配置
configs:
  # 注释，打包为一个文件后的说明
  - note: md颜色
    # 对应文件名称
    file-name: mdColor.css
    # 匹配网址的方式
    matches:
      - # 匹配模式
      - mode: domain
        # 对应模式下的参数
        params:
          - keylol.com
  - note: 变量配置
    # 测试时启用此文件，对应的参数
    file-name: var.css
    # 正式打包时使用此文件
#    file-name: optional.txt
    matches:
      - mode: domain
        params:
          - keylol.com
```

### 完整流程

#### 1. 在config文件中配置一个资源文件

```yaml
configs:
  - note: 自定义样式
    file-name: custom.css
    matches:
      - mode: domain
        params:
          - keylol.com
```

#### 2. 编写样式

#### 3. 打包测试, 启用测试用文件

```yaml
configs:
  - note: 变量配置
    # 测试时启用此文件，对应的参数
    file-name: var.css
    # 正式打包时使用此文件
#    file-name: optional.txt
```
**Export.main()** 打包
```yaml
导出完成
H:\Code\Steam\MDSteamCN\.\src\main\resources\out\main.css\main.css
2020-05-14T22:14:50.140
```

#### 4. 页面查看效果

复制导出文件内容

![1.png](https://i.loli.net/2020/05/14/c71dI9LTA4XiE2W.png)

![2.png](https://i.loli.net/2020/05/14/RjiJ2VHBuK1yLMA.png)

#### 5.发布

修改配置
```yaml
configs:
  - note: 变量配置
    # 测试时启用此文件，对应的参数
#    file-name: var.css
    # 正式打包时使用此文件
    file-name: optional.txt
```
重新打包
    

## 吐槽

之前我曾经做过一个tampermonkey版本的，所做的改动远比这次的stylish版本要大。

之前的想法必须使用js才行，所以我只能等页面加载完成之后再做操作。

遗憾的是，这样做会让页面每次加载的时候闪一下，体验贼差，连我自己都不想用。
