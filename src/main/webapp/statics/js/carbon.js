$(document).ready(function () {
    $('.nav-dropdown-toggle').on('click', function (e) {
        e.preventDefault();
        $(this).parent().toggleClass('open');
    });

    $('ul.nav').find('a.active').parent().parent().parent().addClass('open');

    $('.sidebar-toggle').on('click', function (e) {
        e.preventDefault();
        $('body').toggleClass('sidebar-hidden');
    });

    $('.sidebar-mobile-toggle').on('click', function () {
        $('body').toggleClass('sidebar-mobile-show');
    });

    $("[name='articleUpload']").on('click', function () {
        if ($('.content_md').val() == '' || $('.title').val() == ''){
            alert("文章标题和内容不能为空！");
            return false;
        }
        if ($('.classification').val() == ''){
            $('.classification').val("Blog");
        }
    })

    $('.card-header').on('click',function(){
        var index = $('.card-header').index(this);
        $(this).siblings().removeClass('checked');
        $(this).addClass('checked');
        $('.table').siblings().addClass('hide');
        $('.table:eq(' + index + ')').removeClass('hide');
    });

    $("[type='email']").blur(function(){
        var email = $(this).val();
        if(email == null || email == ''){
            $('.error:first').removeClass('hide');
        }
    });

    $("[type='password']").blur(function(){
        var pwd = $(this).val();
        if(pwd == null || pwd == ''){
            $('.error:first').removeClass('hide');
        }
    });

    $('.delete').on('click',function () {
       if (confirm('确定删除？')){
           return true;
       }
       else {
           return false;
       }
    });

    if (typeof ($.cookie('email')) != 'undefined' && typeof ($.cookie('password')) != 'undefined'){
      $(".card-body [type='email']").val($.cookie('email'));
      $(".card-body [type='password']").val($.cookie('password'));
      $(".card-body [type='checkbox']").attr("checked", true);
    }

    $('.choose input').on('change',function () {
        if ($(this).val() != ''){
            $('.choose label').html($(this).val().substring(12));
        }
        else {
            $('.choose label').html('选择图片');
        }
    });

    $('.upload').on('click', function () {
        if ($('.choose input').val() == ''){
            alert("未选择图片");
            return false;
        }
    });

    $(".register-footer [type='submit']").removeAttr('disabled');

    $(".register-footer [type='submit']").on('click', function () {
        if ($(".register-body [name='name']").val() == '' ||
            $(".register-body [name='email']").val() == '' ||
            $(".register-body [name='password']").val() == ''){
            alert('用户名、邮箱和密码不能为空！');
            return false
        }

        if ($(".register-body [name='password']").val().length < 6 ||
            $(".register-body [name='password']").val().length > 16){
            alert('密码长度为6-16');
            return false;
        }
    });

    $(".buttons #test").on('click', function () {
        if ($("[name='name']").val() == ''){
            alert('请输入名字！');
            return false;
        }

        if ($("[name='email']").val() == ''){
            alert('请输入邮箱');
            return false;
        }
        if ($("[name='content']").val() == ''){
            alert('请输入内容');
            return false;
        }

    })
});
