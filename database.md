版本：v1 

实现系统最基本的数据库支持

# user用户

| 字段名   | 类型    | 描述 | 主键关系   |
| -------- | ------- | ------ | ------ |
| id       | int     | 自增id |主键|
| userName | varchar | 用户名 ||
| password | varchar | 密码   ||
| power | int | 是否管理员,是1否0 ||

# order订单

| 字段名 | 类型 | 描述 | 主键关系|
| ----- | ---- | ---- | ---- |
| id     | int  | 自增id |主键|
| rentUser | int | user主键，租用户id |外键|
| borrowUser | int | user主键，借用户id |外键|
| status | int | 订单是否完成，是1否0 ||
| room | int | room主键，房屋id |外键|

# room房屋

| 字段名   | 类型    | 描述                   | 主键关系 |
| -------- | ------- | ---------------------- | -------- |
| id       | int     | 自增id                 | 主键     |
| rentUser | int     | user主键，租用户id     | 外键     |
| price    | int     | 价格                   |          |
| place    | varchar | 地段                   |          |
| distance	| int	| 距商圈距离(km)		|		|
| status   | int     | 是否已经被预定，是1否0 |          |
| checked  | int     | 是否被审核，是1否0     |          |

 # collection收藏

| 字段名 | 类型 | 描述   | 主键关系 |
| ------ | ---- | ------ | -------- |
| id     | int  | 自增id | 主键     |
| user   | int  | 用户id | 外键     |
| room   | int  | 房屋id | 外键     |

# card_possess卡券

| 字段名   | 类型    | 描述                 | 主键关系 |
| -------- | ------- | -------------------- | -------- |
| id       | int     | 自增id               | 主键     |
| user     | int     | 用户id               | 外键     |
| cardName | varchar | 用户拥有的一个卡券名 |          |

# tag标签

| 字段名 | 类型    | 描述               | 主键关系 |
| ------ | ------- | ------------------ | -------- |
| id     | int     | 自增id             | 主键     |
| room   | int     | 房屋id             | 外键     |
| tag    | varchar | 房屋拥有的一个标签 |          |
