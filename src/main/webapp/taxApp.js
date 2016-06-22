(function(){
	var app = angular.module('app', []);

	app.controller('FormController',['$scope','$http',function($scope,$http){
		
		$scope.saveData=function(){
			
			$http({
			      method: 'POST',
			      url: 'DataHandler',
			      headers: {'Content-Type': 'application/json'},
			      data:  $scope.data
			    }).success(function (data) 
			      {
			    	$scope.status=data;
			    	alert($scope.status);
			    	$scope.data=null;
			      });
		}
	}]);
})();
