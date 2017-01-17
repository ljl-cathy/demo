@search @all

Feature:在电商首页测试搜索功能

Scenario Outline: 在淘宝电商首页测试搜索功能
      Given        当我访问淘宝官网
      When          我尝试在搜索框中输入<keyword>
      Then        搜索结果页面底部<status>分页条
  
 Examples:
    | keyword   | status    |
	| 耐克	    | 有		    | 
	| 毛江邓     	| 无	        | 
	
@interface

Scenario: 在淘宝页面发送请求，返回结果
	Given   当我访问淘宝官网
	When    发送一个get请求
	Then    返回请求结果及其http code