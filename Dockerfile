FROM ghcr.io/medibloc/panacea-core:master

ADD /src/test/resources/scripts/simple-init-start.sh /root/scripts/simple-init-start.sh

EXPOSE 9090

CMD ["/root/scripts/simple-init-start.sh"]