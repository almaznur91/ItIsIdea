<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<body>
<#--<#if model.error??>-->
    <#--<h1>Ошибка</h1>-->
<#--</#if>-->
<form method="post" action="/signIn">
    <input type="text" name="userLogin" placeholder="Логин">
    <input type="password" name="userPassword" placeholder="Пароль">
    <input type="checkbox" name="remember-me" placeholder="Запомнить">
    <input type="submit">
</form>
</body>
</html>