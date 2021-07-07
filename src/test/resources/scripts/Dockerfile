FROM ghcr.io/medibloc/panacea-core:master

ADD ./src/test/resources/scripts/simple-init-start.sh /usr/local/bin/init_script.sh

EXPOSE 9090

CMD ["init_script.sh"]