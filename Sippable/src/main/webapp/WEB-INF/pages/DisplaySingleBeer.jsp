<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<!DOCTYPE html>
<html>

<head>
<!-- Latest compiled and minified CSS -->
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.0-beta.5/angular.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<style>
* {
	box-sizing: content-box;
	alignment-baseline:
}
.header {
	padding: 15px;
	color: #67655D;
}
.image {
	width: 25%;
	float: left;
	padding: 15px;
	margin-left: 8cm;
}
.main {
	width: 25%;
	float: left;
	padding: 15px;
}
.main2 {
	width: 50%;
	float: left;
	padding: 15px;
	margin-left: 8cm;
}
.accordianthing {
	width: 15%;
	float: left;
	padding: 15px;
}
body {
	background-image:url("https://images8.alphacoders.com/413/413078.jpg"); 
	background-repeat: no-repeat;
	background-size: cover;
	media-align:center;
}
.mrpoopants{
background-color: cyan;
background-size: cover;
}
</style>

<script>
//Starrr plugin (https://github.com/dobtco/starrr)
var __slice = [].slice;
(function($, window) {
  var Starrr;
  Starrr = (function() {
    Starrr.prototype.defaults = {
      rating: void 0,
      numStars: 5,
      change: function(e, value) {}
    };
    function Starrr($el, options) {
      var i, _, _ref,
        _this = this;
      this.options = $.extend({}, this.defaults, options);
      this.$el = $el;
      _ref = this.defaults;
      for (i in _ref) {
        _ = _ref[i];
        if (this.$el.data(i) != null) {
          this.options[i] = this.$el.data(i);
        }
      }
      this.createStars();
      this.syncRating();
      this.$el.on('mouseover.starrr', 'span', function(e) {
        return _this.syncRating(_this.$el.find('span').index(e.currentTarget) + 1);
      });
      this.$el.on('mouseout.starrr', function() {
        return _this.syncRating();
      });
      this.$el.on('click.starrr', 'span', function(e) {
    	  //alert(_this.$el.find('span').index(e.currentTarget) + 1);
    	 // alert("USER ID -> " +  ${sessionScope.user.userid});
    	  var rateBeer = "rate/";
    	  var rate = _this.$el.find('span').index(e.currentTarget) + 1;
    	  var id = ${drink.drinkId};
    	  var userid = ${sessionScope.user.userid};
    	  var str = "rate/" + rate + "/" + id + "/" +userid;
             $.get(str, function(data, status){		
    	  	//console.log(data)
    	  	 $("#count-existing").html(data);	 		
    	  });	
        return _this.setRating(_this.$el.find('span').index(e.currentTarget) + 1);
      });
      this.$el.on('starrr:change', this.options.change);
    }
    Starrr.prototype.createStars = function() {
      var _i, _ref, _results;
      _results = [];
      for (_i = 1, _ref = this.options.numStars; 1 <= _ref ? _i <= _ref : _i >= _ref; 1 <= _ref ? _i++ : _i--) {
        _results.push(this.$el.append("<span class='glyphicon .glyphicon-star-empty'></span>"));
      }
      return _results;
    };
    Starrr.prototype.setRating = function(rating) {
      if (this.options.rating === rating) {
        rating = void 0;
      }
      this.options.rating = rating;
      this.syncRating();
      return this.$el.trigger('starrr:change', rating);
    };
    Starrr.prototype.syncRating = function(rating) {
      var i, _i, _j, _ref;
      rating || (rating = this.options.rating);
      if (rating) {
        for (i = _i = 0, _ref = rating - 1; 0 <= _ref ? _i <= _ref : _i >= _ref; i = 0 <= _ref ? ++_i : --_i) {
          this.$el.find('span').eq(i).removeClass('glyphicon-star-empty').addClass('glyphicon-star');
        }
      }
      if (rating && rating < 5) {
        for (i = _j = rating; rating <= 4 ? _j <= 4 : _j >= 4; i = rating <= 4 ? ++_j : --_j) {
          this.$el.find('span').eq(i).removeClass('glyphicon-star').addClass('glyphicon-star-empty');
        }
      }
      if (!rating) {
        return this.$el.find('span').removeClass('glyphicon-star').addClass('glyphicon-star-empty');
      }
    };
    return Starrr;
  })();
  return $.fn.extend({
    starrr: function() {
      var args, option;
      option = arguments[0], args = 2 <= arguments.length ? __slice.call(arguments, 1) : [];
      return this.each(function() {
        var data;
        data = $(this).data('star-rating');
        if (!data) {
          $(this).data('star-rating', (data = new Starrr($(this), option)));
        }
        if (typeof option === 'string') {
          return data[option].apply(data, args);
        }
      });
    }
  });
})(window.jQuery, window);
$(function() {
  return $(".starrr").starrr();
});
$( document ).ready(function() {
      
  $('#stars').on('starrr:change', function(e, value){
    $('#count').html(value);
  });
  
  $('#stars-existing').on('starrr:change', function(e, value){
    $('#count-existing').html(value);
  });
});
</script>
</head>

<body>


<div class="header">
	<div class="page-header">
		<h1><c:out value = "${drink.drinkName}"/></h1>
	</div>
</div>

<div class = "mrpoopants">
	<div class="image">

		<img
			src="https://tse4.mm.bing.net/th?id=OIP.94Ls5N7SrpT6ohv7YXe4ggEsDH&w=289&h=192&c=7&qlt=90&o=4&dpr=1.25&pid=1.7"
			alt="..." class="img-thumbnail" align="center" border="5" width="">


	</div>

	<div class="main">
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"> <c:out
						value="${drink.ibu}" />
			</span> ibu</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out
						value="${drink.aroma}" /></span> aroma</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.color}"/></span>
				appearance</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.alcholContent}"/></span> alcohol
				content</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.brewer}"/></span>
				brewer</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.bevType}"/></span> Type of beer</li>
		</ul>
			<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.ratingAvg}"/></span>
				Rating</li>
		</ul>
	</div>
	<div class="main2">

		<div class="list-group">
			<a href="#" class="list-group-item active">
				<h4 class="list-group-item-heading">Description:</h4>
				<p class="list-group-item-text"><c:out value = "${drink.description}"/></p>
			</a>
		</div>

			<div class="list-group-item active">

    <div class="row lead">
        <p>Rate Beer</p>
        <div id="stars-existing" class="starrr" data-rating='4'></div>
        You gave a rating of <span id="count-existing">4</span> star(s)
    </div>
</div>




	</div>

	
	
	<div class="accordianthing"></div>
</div>

<script>
</script>

</body>
</html>