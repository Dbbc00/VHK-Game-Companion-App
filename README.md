## 项目简介

VHK 游戏陪玩小程序是一个专为游戏玩家和陪玩服务者打造的平台，提供游戏陪玩、聊天互动、订单管理等功能。

## 技术栈

- **后端**：Java 11, Spring Boot 3, MongoDB, Redis, WebSocket
- **管理后台**：Vue 3, Vite, Element Plus
- **微信小程序**：原生微信小程序
- **部署**：Docker, Docker Compose, Nginx

## 项目结构

```
VHK/
├── vhk-backend/           # 后端服务
│   ├── src/               # 源代码
│   ├── pom.xml            # Maven配置
│   └── README.md          # 后端文档
├── vhk-admin/             # 管理后台
│   ├── src/               # 源代码
│   ├── package.json       # 依赖配置
│   └── README.md          # 管理后台文档
├── vhk-miniprogram/       # 微信小程序
│   ├── pages/             # 页面
│   ├── components/        # 组件
│   ├── utils/             # 工具类
│   └── README.md          # 小程序文档
└── README.md              # 项目总文档
```

## 环境搭建

### 后端环境
1. 安装 Java 11
2. 安装 Maven 3.9.12
3. 安装 MongoDB 6.0+
4. 安装 Redis 7.0+

### 管理后台环境
1. 安装 Node.js v24.14.0
2. 安装 npm 11.9.0
3. 配置国内镜像源

### 微信小程序环境
1. 安装微信开发者工具
2. 注册微信小程序账号
3. 配置小程序 AppID

## 环境变量

### 后端环境变量
- `SPRING_DATA_MONGODB_URI`：MongoDB 连接 URI
- `SPRING_DATA_REDIS_HOST`：Redis 主机地址
- `SPRING_DATA_REDIS_PORT`：Redis 端口
- `JWT_SECRET`：JWT 密钥
- `WECHAT_APPID`：微信小程序 AppID
- `WECHAT_SECRET`：微信小程序密钥
- `WECHAT_PAY_MCHID`：微信支付商户号
- `WECHAT_PAY_KEY`：微信支付密钥

### 管理后台环境变量
- `VITE_API_BASE_URL`：API 基础 URL
- `VITE_APP_TITLE`：应用标题

## 端口映射

- 后端服务：8080
- 管理后台：80
- MongoDB：27017
- Redis：6379

## 默认账号

### 管理后台
- 账号：admin
- 密码：admin123

## 数据库初始化

1. 启动 MongoDB 服务
2. 运行后端服务，自动创建集合
3. 初始化敏感词数据

## API 文档

后端服务启动后，访问：`http://localhost:8080/swagger-ui/index.html`

## 常见问题排查

1. **数据库连接失败**
   - 检查 MongoDB 和 Redis 服务是否启动
   - 检查连接字符串是否正确

2. **API 调用失败**
   - 检查后端服务是否启动
   - 检查网络连接
   - 检查请求参数是否正确

3. **微信登录失败**
   - 检查微信小程序 AppID 和 Secret 是否正确
   - 检查网络连接

4. **支付失败**
   - 检查微信支付配置是否正确
   - 检查订单信息是否完整

## 编码规范

- 所有代码注释使用中文
- 变量命名采用驼峰命名法
- 方法命名采用动词+名词形式
- 类命名采用大驼峰命名法
- 代码缩进使用 4 个空格
- 每行代码长度不超过 120 个字符

## 设计规范

### 前端样式规范
- 苹果风格设计
- 内容优先，留白构建层次，克制装饰
- 色彩：背景 #FFFFFF，辅 #F5F5F7；文字：主要 #1D1D1F，次要 #86868B；功能：品牌蓝 #007AFF，警示红 #FF3B30
- 字体：-apple-system, "PingFang SC", sans-serif
- 字重：正文 400，按钮 500，标题 600
- 行高：标题 1.2，正文 1.5
- 布局：8px 网格基准，边距：移动 16px，桌面 24px，内容宽 1200px
- 圆角：按钮 8px，卡片 16px
- 阴影：悬浮 0 2px 8px rgba(0,0,0,0.04)，弹窗 0 10px 30px rgba(0,0,0,0.08)
- 交互：点击透明度 0.6，动画 0.3s 缓动

## 部署说明

### 本地开发
1. 启动 MongoDB 和 Redis 服务
2. 启动后端服务：`mvn spring-boot:run`
3. 启动管理后台：`npm run dev`
4. 在微信开发者工具中打开小程序项目

### Docker 部署
1. 构建镜像：`docker-compose build`
2. 启动服务：`docker-compose up -d`
3. 停止服务：`docker-compose down`

## 版本历史

- v1.0.0：初始版本

## 联系方式

- 团队名称：VKHbug团队
- 官方链接：https://vkhbug-team.vercel.app
- 邮箱：contact@vkhbug.com

## 业务合作

欢迎游戏陪玩平台、游戏公会、电竞俱乐部等相关业务合作，联系方式同上。