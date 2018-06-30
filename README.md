# 易租网接口文档v1

最基本的功能文档，仅包含登录注册，订单，房屋，相关数据

**baseurl: 192.168.1.1/8010**



## user 用户相关操作

地址: /v1/user

### 注册	

地址：/

请求方式：POST

请求参数：

```javascript
{
    "username" : "王睿"
    "password" : "123456"
}
```

返回参数：

```js
{
    "message" :
    {
        "result" : "success"
    }
}
```

### 登录

地址：/

请求方式：GET

请求参数：

```javascript
{
    "username" : "wangrui"
    "password" : "123456"
}
```

返回参数：

```js
{
    "message" :
    {
        "result" : "success"
    }
}
```

## order  订单相关操作

地址：/v1/order

### 出租订单查询

地址:/rent

请求方式：GET

请求参数：

```js
{
   "username" : "王睿"
}
```
返回参数：

```js
{
    {
        "orderid" : "1"
        "rent_user" : "王睿"
        "bor_user" : "孙致波"
        "status" : "1"
        "roomid" : "3"
    },
    {
        "orderid" : "4"
        "rent_user" : "王睿"
        "bor_user" : "易碧喻"
        "status" : "0"
        "roomid" : "6"
    }
}
```
### 借房订单查询：

地址：/borrow

请求方式：GET

请求参数：

```js
{
   "username" : "王睿"
}
```
返回参数：

```js
{
    {
        "orderid" : "1"
        "rent_user" : "王睿"
        "bor_user" : "孙致波"
        "status" : "1"
        "roomid" : "3"
    },
    {
        "orderid" : "4"
        "rent_user" : "王睿"
        "bor_user" : "易碧喻"
        "status" : "0"
        "roomid" : "6"
    }
}
```
### 添加订单：

地址：/

请求方式：POST

请求参数：

```javascript
{
    "rent_user" : "王睿"
    "bor_user" : "孙致波"
    "roomid" : "3"
}
```

返回参数：
```js
{
    "message" :
    {
        "result" : "success"
    }
}
```



### 修改订单：

地址：/

请求方式：PUT

请求参数：

```javascript
{
    "orderid" : "2"
    "rent_user" : "王睿"
    "bor_user" : "孙致波"
    "roomid" : "3"
}
```

返回参数：
```js
{
    "message" :
    {
        "result" : "success"
    }
}
```
### 删除订单

地址：/

请求方式：DELETE

请求参数：

```javascript
{
    "orderid" : "3"
}
```

返回参数：

```js
{
    "message" :
    {
        "result" : "success"
    }
}
```


## room 房屋相关操作

### 查询房屋

地址：/

请求方式：GET

请求参数：

```javascript
{
    "username" : "王睿"
}
```

返回参数：

```js
{
    {
        "roomid" : "2"
        "rent_user" : "王睿"
    	"price" : "3000"
    	"place" : "洪山路108号"
    	"distance" : "4"
        "status" : "0"
        "checked" : "1"
    }
    {
        "roomid" : "3"
        "rent_user" : "王睿"
    	"price" : "4000"
    	"place" : "洪山路109号"
    	"distance" : "4"
        "status" : "0"
        "checked" : "1"
    }
}
```


### 添加房屋：

地址：/

请求方式：POST

请求参数：

```javascript
{
    "rent_user" : "王睿"
    "price" : "3000"
    "place" : "洪山路108号"
    "distance" : "4"
}
```

返回参数：

```js
{
    "message" :
    {
        "result" : "success"
    }
}
```



### 修改房屋：

地址：/

请求方式：PUT

请求参数：

```javascript
{
    "roomid" : "3"
    "rent_user" : "王睿"
    "price" : "3000"
    "place" : "洪山路108号"
    "distance" : "4"
}
```

返回参数：
```js
{
    "message" :
    {
        "result" : "success"
    }
}
```
### 删除房屋

地址：/

请求方式：DELETE

请求参数：

```javascript
{
    "orderid" : "3"
}
```

返回参数：

```js
{
    "message" :
    {
        "result" : "success"
    }
}
```

