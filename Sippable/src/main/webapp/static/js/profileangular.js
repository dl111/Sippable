/**
 * 
 */
var app = angular.module("app", []);

app.controller("initValCtrl", function($scope, $http){
	
	/*$scope.user = {};*/
	$scope.user
	
	$http({
		  method: 'GET',
		  url: 'http://localhost:8090/Sippables/profileinit'
		}).then(function successCallback(response) {
			console.log(response);
		    $scope.user = response.data;
		  }, function errorCallback(response) {
		    console.log("error");
		  });
	
	//FIRST NAME
	$scope.onSubmitFname = function(){
		var newfname = $scope.user.newfname;
		$http({
			  method: 'POST',
			  url: 'http://localhost:8090/Sippables/profilechangefname',
			  data: newfname
			}).then(function successCallback(response) {
				console.log(response);
			    $scope.success = response.data;
			    
			    $http({
					  method: 'GET',
					  url: 'http://localhost:8090/Sippables/profileinit'
					}).then(function successCallback(response) {
						console.log(response);
					    $scope.user = response.data;
					  }, function errorCallback(response) {
					    console.log("error");
					  });
			    
			  }, function errorCallback(response) {
			    console.log("error");
			  });
	}
	
	//LAST NAME
	$scope.onSubmitLname = function(){
		var newlname = $scope.user.newlname;
		$http({
			  method: 'POST',
			  url: 'http://localhost:8090/Sippables/profilechangelname',
			  data: newlname
			}).then(function successCallback(response) {
				console.log(response);
			    $scope.success = response.data;
			    
			    $http({
					  method: 'GET',
					  url: 'http://localhost:8090/Sippables/profileinit'
					}).then(function successCallback(response) {
						console.log(response);
					    $scope.user = response.data;
					  }, function errorCallback(response) {
					    console.log("error");
					  });
			    
			  }, function errorCallback(response) {
			    console.log("error");
			  });
	}
	
	//EMAIL
	
	$scope.onSubmitEmail = function(){
		var newemail = $scope.user.newemail;
		$http({
			  method: 'POST',
			  url: 'http://localhost:8090/Sippables/profilechangeemail',
			  data: newemail
			}).then(function successCallback(response) {
				console.log(response);
			    $scope.success = response.data;
			    
			    $http({
					  method: 'GET',
					  url: 'http://localhost:8090/Sippables/profileinit'
					}).then(function successCallback(response) {
						console.log(response);
					    $scope.user = response.data;
					  }, function errorCallback(response) {
					    console.log("error");
					  });
			    
			  }, function errorCallback(response) {
			    console.log("error");
			  });
	}
	
	//PASSWORD
	
	$scope.onSubmitPw = function(){
		var newpassword = $scope.user.newpw;
		$http({
			  method: 'POST',
			  url: 'http://localhost:8090/Sippables/profilechangefname',
			  data: newpassword
			}).then(function successCallback(response) {
				console.log(response);
			    $scope.success = response.data;
			    
			    $http({
					  method: 'GET',
					  url: 'http://localhost:8090/Sippables/profileinit'
					}).then(function successCallback(response) {
						console.log(response);
					    $scope.user = response.data;
					  }, function errorCallback(response) {
					    console.log("error");
					  });
			    
			  }, function errorCallback(response) {
			    console.log("error");
			  });
	}
		
	
});

/*app.controller("ChangeFname", function($scope, $http){
	$scope.onSubmit = function(){
		var newfname = $scope.user.newfname;
		$http({
			  method: 'POST',
			  url: 'http://localhost:8090/Sippables/profilechangefname',
			  data: newfname
			}).then(function successCallback(response) {
				console.log(response);
			    $scope.success = response.data;
			    
			    $http({
					  method: 'GET',
					  url: 'http://localhost:8090/Sippables/profileinit'
					}).then(function successCallback(response) {
						console.log(response);
					    $scope.user = response.data;
					  }, function errorCallback(response) {
					    console.log("error");
					  });
			    
			  }, function errorCallback(response) {
			    console.log("error");
			  });
		
		
		
		
		
}});
*/

