$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("todo.feature");
formatter.feature({
  "line": 3,
  "name": "在电商首页测试搜索功能",
  "description": "",
  "id": "在电商首页测试搜索功能",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    },
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.scenario({
  "line": 17,
  "name": "在淘宝页面发送请求，返回结果",
  "description": "",
  "id": "在电商首页测试搜索功能;在淘宝页面发送请求，返回结果",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@interface"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "当我访问淘宝官网",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "发送一个get请求",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "返回请求结果及其http code",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoImplement.total()"
});
formatter.result({
  "duration": 8431081813,
  "status": "passed"
});
formatter.match({
  "location": "DemoImplement.finished()"
});
formatter.result({
  "duration": 3805243007,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
