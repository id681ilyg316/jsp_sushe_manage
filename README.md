## 本项目实现的最终作用是基于JSP学校宿舍管理系统
## 分为3个角色
### 第1个角色为系统管理员角色，实现了如下功能：
 - 入住登记
 - 学生管理
 - 宿舍管理
 - 寝室调换
 - 楼宇管理
 - 楼宇管理员管理
 - 登录页面
 - 缺寝记录
 - 迁出登记
 - 迁出记录
### 第2个角色为楼宇管理员角色，实现了如下功能：
 - 学生管理
 - 登录页面
 - 缺勤记录查询
### 第3个角色为学生角色，实现了如下功能：
 - 查看缺勤记录
 - 登录页面
## 数据库设计如下：
# 数据库设计文档

**数据库名：** sushe_manage

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [admin](#admin) |  |
| [building](#building) |  |
| [domitory](#domitory) |  |
| [log](#log) |  |
| [out1](#out1) |  |
| [student](#student) | 学生表 |
| [tb](#tb) |  |
| [teacher](#teacher) | 用户表 |

**表名：** <a id="admin">admin</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | Admin_ID |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | Admin_Username |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | Admin_Password |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | Admin_Name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | Admin_Sex |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | Admin_Tel |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="building">building</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | Building_ID |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | Building_Name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | Building_Introduction |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="domitory">domitory</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | Domitory_ID |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | Domitory_BuildingID |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | Domitory_Name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | Domitory_Type |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | Domitory_Number |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | Domitory_Tel |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="log">log</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | Log_ID |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | Log_StudentID |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | Log_TeacherID |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  4   | Log_Date |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | Log_Remark |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="out1">out1</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | Out_ID |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | Out_StudentID |   varchar   | 11 |   0    |    Y     |  N   |   NULL    |   |
|  3   | Out_Date |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | Out_Remark |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="student">student</a>

**说明：** 学生表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | Student_ID |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | Student_DomitoryID |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | Student_Username |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | Student_Password |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | Student_Name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | Student_Sex |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  7   | Student_Class |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  8   | Student_State |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="tb">tb</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | TB_ID |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | TB_TeacherID |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | TB_BuildingID |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="teacher">teacher</a>

**说明：** 用户表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | Teacher_ID |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | Teacher_Username |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | Teacher_Password |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | Teacher_Name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | Teacher_Sex |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | Teacher_Tel |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**运行不出来可以微信 javape 我的公众号：源码码头**
