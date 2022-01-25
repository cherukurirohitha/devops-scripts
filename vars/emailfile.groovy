def sendemail(toemail){
  emailext body: 'Hello Jenkins', subject: 'JenkinsTestemail', to: "${toemail}"
}
