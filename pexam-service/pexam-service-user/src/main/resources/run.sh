#!/bin/sh
  
SERVER=/home/jhuser/hug2.0/service/hug-service-health-1.0.0
cd $SERVER
  
case "$1" in  

  start)  
    nohup java -Xmx128m -jar hug-service-health-1.0.0.jar -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=n >/dev/null 2>&1 &
    echo $! > $SERVER/hug-service-health.pid
    ;;  
  
  stop)  
    kill `cat $SERVER/hug-service-health.pid`
    rm -rf $SERVER/hug-service-health.pid
    ;;  
  
  restart)  
    $0 stop  
    sleep 1  
    $0 start  
    ;;  
  
  *)  
    echo "Usage: run.sh {start|stop|restart}"  
    ;;  
  
esac 
exit 0
